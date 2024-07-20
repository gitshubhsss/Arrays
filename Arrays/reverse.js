let arr = [2, 4, 6, 8, 10, 12];
let reverseArr = [];
let start = arr.length - 1;
let end = start;
while (start >= 0) {
  reverseArr.push(arr[start]);
  start--
}
console.log(reverseArr);
