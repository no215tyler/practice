// ################################
// 問題: 複数のAPIリクエストと結果の統合
// ################################
// 以下のステップに従って、複数のAPIからデータを取得し、それを統合するJavaScriptコードを書いてください。

// (1)ユーザー情報の取得:
//    https://jsonplaceholder.typicode.com/users からユーザー情報をフェッチしてください。

// (2)各ユーザーの投稿情報の取得:
//    フェッチしたユーザー情報を用いて、各ユーザーの投稿情報（posts）を https://jsonplaceholder.typicode.com/posts?userId=<userId> から取得してください。
//    例: ユーザーIDが1の場合、URLは https://jsonplaceholder.typicode.com/posts?userId=1 となります。

// (3)結果の統合:
//    各ユーザーの情報とそのユーザーの投稿を組み合わせて、新しいオブジェクトを作成し、以下のフォーマットで結果をコンソールに表示してください。
// [
//   {
//     "userId": 1,
//     "name": "Leanne Graham",
//     "posts": [
//       {
//         "postId": 1,
//         "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"
//       },
//       ...
//     ]
//   },
//   ...
// ]

// 制約:
// async/awaitを使用してください。
// 非同期処理の際にはPromise.allを使用してください。

// 評価: 10/10
// ##############
// フィードバック
// ##############
// 適切な非同期処理:
// async/awaitの使用が適切であり、非同期処理を効率的に行っています。

// Promise.allの使用:
// 複数のAPIリクエストを並行して処理し、すべてのPromiseが解決された後に結果を取得している点が素晴らしいです。

// 結果の統合:
// ユーザー情報と投稿情報を適切に統合し、要求されたフォーマットで出力しています。

// 改善点
// 今回は完璧な実装でしたが、さらなる改善点として以下を考慮しても良いかもしれません：

// エラーハンドリング:
// ネットワークエラーやレスポンスエラーに対するエラーハンドリングを追加すると、コードがさらに堅牢になります。
// 改善例
// 以下はエラーハンドリングを追加した例です。

// ユーザー情報の取得
const fetchUsersData = async () => {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/users");
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    const users = await response.json();
    return users;
  } catch (error) {
    console.error('Fetch users data failed:', error);
  }
};

// 各ユーザーの投稿情報の取得
const fetchPostsForUsersData = async (users) => {
  try {
    const promises = users.map(user =>
      fetch(`https://jsonplaceholder.typicode.com/posts?userId=${user.id}`).then(res => {
        if (!res.ok) {
          throw new Error('Network response was not ok');
        }
        return res.json();
      })
    );
    const posts = await Promise.all(promises);
    return posts;
  } catch (error) {
    console.error('Fetch posts for users failed:', error);
  }
};

// 結果の統合
const getUsersWithPosts = async () => {
  const users = await fetchUsersData();
  if (!users) return; // エラー時は処理を中断

  const posts = await fetchPostsForUsersData(users);
  if (!posts) return; // エラー時は処理を中断

  const result = users.map((user, index) => ({
    userId: user.id,
    name: user.name,
    posts: posts[index].map(post => ({
      postId: post.id,
      title: post.title
    }))
  }));

  console.log(JSON.stringify(result, null, 2));
};

getUsersWithPosts();
