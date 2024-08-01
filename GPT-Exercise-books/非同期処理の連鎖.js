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

const { stringify } = require("querystring");

const fetchUser = async () => {
  const userRes = await fetch("https://jsonplaceholder.typicode.com/users/1");
  const user = await userRes.json();
  return user;
};

const fetchPosts = async () => {
  const postsResponse = await fetch("https://jsonplaceholder.typicode.com/posts?userId=1");
  const posts = await postsResponse.json();
  return posts;
};

const fetchComments = async (posts) => {
  const promises = posts.map(post => 
    fetch(`https://jsonplaceholder.typicode.com/comments?postId=${post.id}`).then(res => res.json())
  );
  const comments = await Promise.all(promises);
  return comments;
};

const mergePosts = async () => {
  const user = await fetchUser();
  const posts = await fetchPosts();
  const comments = await fetchComments(posts);
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
};

mergePosts();
