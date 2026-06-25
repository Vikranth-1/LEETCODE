int finalValueAfterOperations(char** operation, int operationsSize) {
    int x=0;
    for(int i=0;i<operationsSize;i++){
        if(strcmp(operation[i],"X--")==0){
            x--;
        }else if(strcmp(operation[i],"X++")==0){
            x++;
        }else if(strcmp(operation[i],"--X")==0){
            --x;
        }else if(strcmp(operation[i],"++X")==0){
            ++x;
        }
    }
    return x;
}
