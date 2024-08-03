// ###############################
// 問題: 複数のAPIリクエストの依存関係
// ###############################
// 以下のステップに従って、APIリクエストの依存関係を管理し、結果をまとめて出力するJavaScriptコードを書いてください。

// (1)ユーザー情報の取得:
//    https://jsonplaceholder.typicode.com/users/1 から特定のユーザー情報を取得してください。

// (2)ユーザーのアルバム情報の取得:
//    取得したユーザーのIDを使って、そのユーザーのアルバム情報を https://jsonplaceholder.typicode.com/albums?userId=1 から取得してください。

// (3)各アルバムの写真情報の取得:
//    各アルバムのIDを使って、そのアルバムの写真情報を https://jsonplaceholder.typicode.com/photos?albumId=<albumId> から取得してください。

// (4)結果の統合:
//    ユーザー情報、アルバム情報、写真情報を統合して、以下のフォーマットでコンソールに表示してください。
  // {
  //   "userId": 1,
  //   "name": "Leanne Graham",
  //   "albums": [
  //     {
  //       "albumId": 1,
  //       "title": "quidem molestiae enim",
  //       "photos": [
  //         {
  //           "photoId": 1,
  //           "title": "accusamus beatae ad facilis cum similique qui sunt"
  //         },
  //         ...
  //       ]
  //     },
  //     ...
  //   ]
  // }

// 評価: 10/10
// #############
// フィードバック
// #############
// 非同期処理をうまく扱い、APIリクエストの依存関係を管理し、データを正しく統合しています。以下の点が特に優れていると感じました：

// 適切な非同期処理:
// async/awaitを使用して、各非同期操作を順次実行しています。

// Promise.allの使用:
// 複数のアルバムに対する写真情報の取得にPromise.allを使用して効率的にデータを取得しています。

// エラーハンドリング:
// 各フェッチ操作で適切にエラーハンドリングを実装しています。

// 改善点
// 全体的に非常に良い実装ですが、いくつかの改善点を考慮することでコードがさらに堅牢になります：

// フェッチ関数の一般化:
// フェッチ関数を一般化して、どのエンドポイントにも対応できるようにすることでコードの再利用性を高めることができます。
// 改善例
// 以下はフェッチ関数を一般化した例です。

const fetchData = async (url) => {
  try {
    const response = await fetch(url);
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    const data = await response.json();
    return data;
  } catch (error) {
    console.error(`Fetch data failed from ${url}:`, error);
  }
};

const mergeData = async () => {
  const user = await fetchData("https://jsonplaceholder.typicode.com/users/1");
  if (!user) return;

  const albams = await fetchData(`https://jsonplaceholder.typicode.com/albums?userId=${user.id}`);
  if (!albams) return;

  const promises = albams.map(albam => fetchData(`https://jsonplaceholder.typicode.com/photos?albumId=${albam.id}`));
  const photosArray = await Promise.all(promises);
  if (!photosArray) return;

  const result = {
    userId: user.id,
    name: user.name,
    albams: albams.map((albam, index) => ({
      albamId: albam.id,
      title: albam.title,
      photos: photosArray[index].map(photo => ({
        photoId: photo.id,
        title: photo.title,
      }))
    }))
  };
  
  console.log(JSON.stringify(result, null, 2));
};

mergeData();
