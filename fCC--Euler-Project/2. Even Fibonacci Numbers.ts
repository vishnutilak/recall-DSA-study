function fiboEvenSum(n: number): number {
  let a: number = 1;
  let b: number = 2;
  let sum: number = 0;

  while (b <= n) {
    if (b % 2 === 0) {
      sum += b;
    }
    const next: number = a + b;
    a = b;
    b = next;
  }

  return sum;
}
