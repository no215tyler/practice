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

const fetchUser = async () => {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/users/1");
    const userData = await response.json();
    return userData;
  } catch (error) {
    console.log("Fetch UserData Failed", error);
  }
};

const fetchAlbamData = async (user) => {
  try {
    const responseAlbams = await fetch(`https://jsonplaceholder.typicode.com/albums?userId=${user.id}`);
    const albams = await responseAlbams.json();
    return albams
  } catch (error) {
    console.log("Fetch AlbamsData Failed", error);
  }
};

const fetchPhotoData = async (albams) => {
  try {
    const promises = albams.map(albam => 
      fetch(`https://jsonplaceholder.typicode.com/photos?albumId=${albam.id}`)
      .then(res => {
        if (!res.ok) {
          throw new Error("fetchPhotoレスポンスエラー");
        }
        return res.json();
      })
    )
    const photos = await Promise.all(promises);
    return photos
  } catch (error) {
    console.log("Fetch PhotosData Failed", error);
  }
};

const mergeData = async () => {
  const user = await fetchUser();
  const albams = await fetchAlbamData(user);
  const photosArray = await fetchPhotoData(albams);
  // console.log(`Userデータ: ${JSON.stringify(user)}`);
  // console.log(`Albamsデータ: ${JSON.stringify(albams)}`);
  // console.log(`Photosデータ: ${JSON.stringify(photosArray)}`);

  const result = {
    userId: user.id,
    name: user.name,
    albams: albams.map((albam, index) => ({
      albamId: albam.id,
      title: albam.title,
      photos: photosArray[index].map(photo =>({
        photoId: photo.id,
        title: photo.title,
      }))
    }))
  }
  console.log(JSON.stringify(result, null, 2));
};

mergeData();
