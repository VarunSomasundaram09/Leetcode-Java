char* longestCommonPrefix(char** strs, int strsSize) {
    int len=0;
    while(1){
        char c=strs[0][len];
        if (c == '\0') break;
        int match=1;
        for(int i=1;i<strsSize;i++){
            if(strs[i][len]!=c){
                match=0;
                break;
            }
        }
        if(!match) break;
    len++;
    }
           char* res=(char*)malloc(len+1);
           memcpy(res, strs[0], len);
    res[len] = '\0';
    return res;

    
}