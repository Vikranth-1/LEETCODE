int reverse(int x) {
    long long s = 0;
    while (x != 0) {
        int r = x % 10;
        s = s * 10 + r;
        if (s > INT_MAX || s < INT_MIN)
            return 0;
        x /= 10;
    }
    return (int)s;
}
