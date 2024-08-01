// #######################
// 問題: 非同期処理の連鎖
// #######################
// 以下のステップに従って、複数の非同期操作を順次実行し、その結果をまとめて出力するJavaScriptコードを書いてください。
// (1)ユーザー情報の取得:
//    https://jsonplaceholder.typicode.com/users/1 から特定のユーザー情報を取得してください。
// (2)ユーザーの投稿情報の取得:
//    取得したユーザーのIDを使って、そのユーザーの投稿情報を https://jsonplaceholder.typicode.com/posts?userId=1 から取得してください。
// (3)ユーザーのコメント情報の取得:
//    各投稿のIDを使って、その投稿のコメント情報を https://jsonplaceholder.typicode.com/comments?postId=<postId> から取得してください。
// (4)結果の統合:
//    ユーザー情報、投稿情報、コメント情報を統合して、以下のフォーマットでコンソールに表示してください。
// {
//   "userId": 1,
//   "name": "Leanne Graham",
//   "posts": [
//     {
//       "postId": 1,
//       "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
//       "comments": [
//         {
//           "commentId": 1,
//           "name": "id labore ex et quam laborum"
//         },
//         ...
//       ]
//     },
//     ...
//   ]
// }
// 制約:
// async/awaitを使用してください。


// 評価: 10/10
// #############
// フィードバック
// #############
// コードは明確であり、要求されたステップをすべて正確に実行しています。非同期処理を適切に行い、データを統合して正しいフォーマットで出力しています。

// 特に優れた点
// 非同期処理の連鎖:
// 各フェッチ操作を順次実行し、適切にデータを統合しています。

// Promise.allの使用:
// 複数の投稿に対するコメント情報の取得にPromise.allを使用し、効率的にデータを取得しています。

// コードの構造:
// 各フェッチ操作が関数に分離されており、コードが見やすくなっています。

// 改善点
// 今回のコードは非常に完成度が高いため、特に大きな改善点はありませんが、エラーハンドリングを追加することで、より堅牢なコードになるでしょう。

// 改善例
// 以下にエラーハンドリングを追加した例を示します。
const fetchUser = async () => {
  try {
    const userRes = await fetch("https://jsonplaceholder.typicode.com/users/1");
    if (!userRes.ok) throw new Error('Network response was not ok');
    const user = await userRes.json();
    return user;
  } catch (error) {
    console.error('Fetch user failed:', error);
  }
};

const fetchPosts = async () => {
  try {
    const postsResponse = await fetch("https://jsonplaceholder.typicode.com/posts?userId=1");
    if (!postsResponse.ok) throw new Error('Network response was not ok');
    const posts = await postsResponse.json();
    return posts;
  } catch (error) {
    console.error('Fetch posts failed:', error);
  }
};

const fetchComments = async (posts) => {
  try {
    const promises = posts.map(post => 
      fetch(`https://jsonplaceholder.typicode.com/comments?postId=${post.id}`).then(res => {
        if (!res.ok) throw new Error('Network response was not ok');
        return res.json();
      })
    );
    const comments = await Promise.all(promises);
    return comments;
  } catch (error) {
    console.error('Fetch comments failed:', error);
  }
};

const mergePosts = async () => {
  try {
    const user = await fetchUser();
    if (!user) return;
    
    const posts = await fetchPosts();
    if (!posts) return;
    
    const comments = await fetchComments(posts);
    if (!comments) return;
    
    const result = {
      userId: user.id,
      name: user.name,
      posts: posts.map((post, i) => ({
        postId: post.id,
        title: post.title,
        comments: comments[i].map(comment => ({
          commentId: comment.id,
          name: comment.name
        }))
      }))
    };
    console.log(JSON.stringify(result, null, 2));
  } catch (error) {
    console.error('Merge posts failed:', error);
  }
};

mergePosts();
