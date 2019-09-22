//
//  main.c
//  app
//
//  Created by changqing on 2019/8/3.
//  Copyright © 2019 changqing. All rights reserved.
//

#include <stdio.h>




int main(int argc, const char * argv[]) {
    // insert code here...
    int sum = 0;
    for(int i = 0 ; i <= 100; i++){
        sum += i;
    }
    printf("%d", sum);
    return 0;
}
