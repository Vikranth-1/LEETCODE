int myAtoi(char *s) {
    long long num = 0;
    int sign = 1;
    int i = 0;
    while (s[i] == ' ')
        i++;
    if (s[i] == '+' || s[i] == '-') {
        if (s[i] == '-')
            sign = -1;
        i++;
    }
    while (s[i] >= '0' && s[i] <= '9') {
        num = num * 10 + (s[i] - '0');
        if (sign * num > INT_MAX)
            return INT_MAX;
        if (sign * num < INT_MIN)
            return INT_MIN;
        i++;
    }
    return (int)(sign * num);
}
