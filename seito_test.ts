// 条件: reverseメソッドは使わないこと
const reversedStrs = (strs: string[]): string[] => {
  const resultArray: string[] = [];
  for (let i: number = strs.length - 1; i >= 0; i--) {
      resultArray.push(strs[i]);
  }
  return resultArray;
};

console.log(reversedStrs(["a", "b", "c"]));

// #########################
// interfaceの基本構文と拡張構文
// #########################

interface UserProp {
  userId: number;
  name: string;
  age: number;
  email?: string;
  isActive: boolean;
};

// interface 拡張名称 extends 継承元 {}
interface AdminUser extends UserProp {
  role: string; // "admin", "leader", "manager"
}

// #########################
//   typeの基本構文と拡張構文
// #########################

type UsersProp = {
    userId: number;
    name: string;
    age: number;
    email?: string;
    isActive: boolean;
  }
  
  // type 拡張名称 = 継承元 & {}
  type AdminUserProps = UsersProp & {
      role: string; // "admin", "leader", "manager"
    }
    
const createAccount = (accountInfo: AdminUserProps) => {
  // 処理
};

createAccount({
  userId: 2,
  name: "NOB",
  age: 37,
  email: "example@com",
  isActive: true,
  role: "admin",
})

// #########################
//      classの基本構文
// #########################

class User {
  userId: number;
  name: string;
  age: number;
  email: string;
  isActive: boolean;

  constructor(userId: number, name: string, age: number, email: string, isActive: boolean) {
      this.userId = userId;
      this.name = name;
      this.age = age;
      this.email = email;
      this.isActive = isActive;
  }

  // public: インスタンスメソッドとしてアクセス可能
  // private: クラス内でアクセス可能
  // protected: クラス内, サブクラス内からアクセス可
  public getProfile(): string {
      return `${this.age}歳 の ${this.name}です。`
  }

  // static: インスタンスメソッドにしなくても直に呼び出すことができる(public, privateなどと併用可)
  static sayHelloWorld(): void {
    console.log("Hello World");
  }
}

const user = new User(1, "NOB", 37, "example@gmail.com", true);
user.getProfile();
User.sayHelloWorld();

// #########################
//        ジェネリクス
// #########################
// 汎用性の高い関数やclassを作るときに用いられることが多い
const foo = <T>(arg: T): T {
  return arg;
}

// 関数を呼び出すときに型を決める
foo<string>("Hello World");
