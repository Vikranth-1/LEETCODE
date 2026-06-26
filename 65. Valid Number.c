bool isNumber(char* s) {
    bool hasDigit = false;
    bool hasDot = false;
    bool hasExp = false;
    if (*s == '+' || *s == '-') s++;
    while (*s) {
        if (isdigit(*s)) {
            hasDigit = true;
        }
        else if (*s == '.') {
            if (hasDot || hasExp) return false;
            hasDot = true;
        }
        else if (*s == 'e' || *s == 'E') {
            if (!hasDigit || hasExp) return false;
            hasExp = true;
            hasDigit = false;
            if (*(s+1) == '+' || *(s+1) == '-') s++;
            if (!isdigit(*(s+1))) return false;
        }
        else {
            return false;
        }
        s++;
    }
    return hasDigit;
}
