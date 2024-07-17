// ###############################
//    Promise / async / await
// ###############################

// console.log("1人目ゾロ");
// console.log("2人目ナミ");
// console.log("3人目ウソップ");
// console.log("4人目サンジ");

// console.log("--setTimeoutを利用")
// console.log("1人目ゾロ");
// // setTimeout(関数, 時間);
// setTimeout(() => {console.log("2人目ナミ")}, 1000);
// console.log("3人目ウソップ");
// console.log("4人目サンジ");
// // JavaScriptは処理を待てない

// ###############################
// setTimeoutのネスト（これは古の手法）
// ###############################
// console.log("--setTimeoutのネスト");
// const luffy_members = () => {
//   console.log("1人目ゾロ");
//   setTimeout(() => {
//     console.log("2人目ナミ");
//     setTimeout(() => {
//       console.log("3人目ウソップ");
//       setTimeout(() => {
//         console.log("4人目サンジ");
//       }, 2000);
//     }, 2000);
//   }, 2000);
// };
// luffy_members();

// ###############################
// 処理の順番に約束をする「Promise」
// ###############################
// console.log("--Promiseを利用")
// console.log("1人目ゾロ");
// new Promise((resolve, reject) => {
//   setTimeout(() => {
//     console.log("2人目ナミ");
//     resolve("ウソップ");
//   }, 3000)
// }).then((usoppu) => { console.log(`3人目${usoppu}`); })
// .then(() => { console.log("俺がキャプテンだ!") })
// .catch(() => { console.log("3人目はまだです"); })
// .finally(() => { console.log("仲間が増えた!"); });

// new Promise((resolve, reject) => { 非同期処理の本体 });
//              resolve: 成功を通知する関数
//              reject : 失敗を通知する関数
//                  非同期処理本体の中で resolve() reject() を呼び出す
//                  どちらも非同期処理の結果を受け取るメソッド
//              then   : 成功した時の処理(resolve()が呼び出されたとき)
//              catch  : 失敗した時の処理(reject()が呼び出されたとき)
//              finally: 成功/失敗に関わらず、完了の処理を必ず実行する


// ###############################
// thenで処理をつなげる例
// ###############################
// console.log("--Promise(thenでつなげる)")
// new Promise((resolve) => {
//   setTimeout(() => {
//     console.log("1人目ゾロ");
//     resolve();
//   }, 1000);
// })
// .then(() => {
//   return new Promise((resolve) => {
//     setTimeout(() => {
//       console.log("2人目ナミ");
//       resolve();
//     }, 1000);
//   })
// })
// .then(() => {
//   return new Promise((resolve) => {
//     setTimeout(() => {
//       console.log("3人目ウソップ");
//       resolve();
//     }, 1000);
//   })
//   })
//   .then(() => {
//     return new Promise((resolve) => {
//       setTimeout(() => {
//         console.log("4人目サンジ");
//       }, 1000)
//     });
//   })
  
  
// ###############################
// async, await
// ###############################
// Promiseを利用した構文よりも、簡潔に非同期処理が書ける
// async: 非同期関数を定義する関数宣言
//    ex) async function sample() { 処理本体 };
//        ^
//        function関数の場合はfunctionの前にasyncを付ける
//    ex) const sample = async () => { 処理本体 };
//                       ^
//                       アロー関数の場合は引数()の前にasyncを付ける
//        async functionは呼び出されるとPromiseを返す
//        値をreturnした場合、Promiseは戻り値をresolve
//        例外,throwした場合、その値をreject

const straw_hat_pirates = async () => {
  await become_menber("1人目ゾロ"); // 関数の前にあるため
  await become_menber("2人目ナミ"); // Promiseの結果が来るまで処理を待機
  await become_menber("3人目ウソップ");
  await become_menber("4人目サンジ");
};

const become_menber = (member) => {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log(member);
      resolve();
    }, 1000);
  });
};

console.log("--async awaitを利用--")
straw_hat_pirates();
