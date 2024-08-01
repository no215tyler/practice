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

// ユーザー情報の取得
const fetchUsersData = async () => {
  const response = await fetch("https://jsonplaceholder.typicode.com/users");
  const users = await response.json();
  return users;
};

// 各ユーザーの投稿情報の取得
const fetchPostsForUsersData = async (users) => {
  const promises = users.map(user =>
    fetch(`https://jsonplaceholder.typicode.com/posts?userId=${user.id}`).then(res => res.json())
  );
  const posts = await Promise.all(promises);
  return posts;
};

// 結果の統合
const getUsersWithPosts = async () => {
  const users = await fetchUsersData();
  const posts = await fetchPostsForUsersData(users);

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

