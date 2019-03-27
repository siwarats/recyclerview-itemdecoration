# recyclerview-itemdecoration
[![](https://jitpack.io/v/siwarats/recyclerview-itemdecoration.svg)](https://jitpack.io/#siwarats/recyclerview-itemdecoration)

## Feature 
##### StickyHeaderItemDecoration 
![](https://github.com/siwarats/recyclerview-itemdecoration/blob/master/sticky_header_preview.gif)

## Add to your project
Step 1. Add the JitPack repository to your build file
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Step 2. Add the dependency
```
//If used old support library
dependencies {
    implementation 'com.github.siwarats:recyclerview-itemdecoration:1.0.1'
}
//If used AndroidX
dependencies {
    implementation 'com.github.siwarats:recyclerview-itemdecoration:2.0.0'
}
```

## How to use
##### StickyHeaderItemDecoration
```
//Add StickyHeaderItemDecoration to your RecyclerView
recyclerView?.addItemDecoration(StickyHeaderItemDecoration())
```
```
//Create your ViewHolder that impletemented StickyViewHolder
inner class HeaderViewHolder(v: View) : StickyViewHolder(v)
```
