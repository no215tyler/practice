// ###########################
// 問題: APIデータのフェッチと処理
// ###########################
// 以下のステップに従って、APIからデータを取得し、それを処理するJavaScriptコードを書いてください。

// APIからデータを取得する:
// https://jsonplaceholder.typicode.com/posts というURLからデータをフェッチしてください。

// データの最初の5つのエントリを抽出する:
// フェッチしたデータから最初の5つのエントリを抽出してください。

// 抽出したデータをコンソールに表示する:
// 抽出したデータを、適切なフォーマットでコンソールに表示してください（例: 各エントリのidとtitle）。

// 制約:

// fetch APIを使用してください。
// async/awaitを使用して非同期処理を行ってください。

// サンプル出力
// ID: 1, Title: sunt aut facere repellat provident occaecati excepturi optio reprehenderit
// ID: 2, Title: qui est esse
// ID: 3, Title: ea molestias quasi exercitationem repellat qui ipsa sit aut
// ID: 4, Title: eum et est occaecati
// ID: 5, Title: nesciunt quas odio


const getData = async () => {
  let response = await fetch("https://jsonplaceholder.typicode.com/posts");
  let data = await response.json();
  for (let i = 0; i < 5; i++) {
    let id = Object.values(data)[i].id;
    let title = Object.values(data)[i].title;
    console.log(`ID: ${id} Title: ${title}`)
  }
}

getData();
