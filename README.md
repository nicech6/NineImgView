# NineImgView
仿微信朋友圈九张图片控件
# Use
### 1.写一个类继承NineImgView，实现三个方法：
* displayOneImage：
 顾名思义只有一张图片调用该方法加载图片，
* displayImage：
 不是一张图片时调用该方法加载图片
* onClickImage：
 图片点击监听
 ### 2.XML控件
 在XML控件中全路径写该控件，比如我写的时ExampleImgView
<pre><code>
  <com.cuihai.nineimgview.ExampleImgView
        android:id="@+id/img"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
</code></pre>
## About Me
weibo : <https://www.weibo.com/icuihai>

gmail  : icuihai@gmail.com
## License
Copyright 2017 icuihai.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
