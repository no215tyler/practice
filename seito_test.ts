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

