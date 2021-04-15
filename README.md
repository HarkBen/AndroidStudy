### 安卓打包后hostApp覆盖子module 资源情况


类型| hostApp是否会覆盖
|:--:|:--:|
color中定义的值|是
string中定义的值	|是
dimen中定义的值|是
layout文件	|是
drawable中的图片|是
drawable的shape文件|是
styles中的style|是

总结：android 在做资源打包时，会对整个app的所有资源进行合并，相同资源会放在同一个文件夹下，所以所有资源都不可重名，重名就会被覆盖。
