# android-demo

## 项目简介
```
这是一个安卓练习demo
```

## 项目下载git地址
```
https://github.com/liqian-code/android-demo.git
```

## 环境依赖
```
Gradle Version: 6.5
Android Gradle Plugin Version: 4.1.3
Android Studio Version: 4.1.3
language: java
minSdkVersion: 16(API 16: Android 4.1(Jelly Bean))
```

#项目搭建步骤
```
1、创建一个安卓空项目
2、将安卓项目管理到GitHub上
    （1）进入GitHub官网（https://github.com/），点击 New repository新建一个“空”项目。
    （2）填写相应信息后点击create即可。
        ① Repository name: 仓库名称；
        ② Description(可选): 仓库描述介绍；
        ③ Public, Private : 仓库权限（公开共享，私有或指定合作者）；
        ④ Initialize this repository with a README: 添加一个README.md；
        ⑤ gitignore: 不需要进行版本管理的仓库类型，对应生成文件.gitignore；
        ⑥ license: 证书类型，对应生成文件LICENSE；
    （3）copy这个仓库的地址，备用。
    （4）本地操作：右键你的安卓项目，选择Git Bush Here。
    （5）把GitHub上面的仓库地址（第三步）克隆到本地。输入指令：git clone https://github.com/liqian-code/android-demo.git
    （6）本地项目文件夹下会多出一个文件夹（android-demo），本地项目文件夹下的所有文件（除了新多出的那个文件夹不用），其余都复制到那个新多出的文件夹下。
    （7）输入指令：cd android-demo，进入android-demo文件夹。
    （8）依次输入下方指令：
        ① git add .                   （注：别忘记后面的.，此操作是把Test文件夹下面的文件都添加进来）
        ② git commit  -m  "提交信息"   （注：“提交信息”里面换成你需要，如“first commit”）
        ③ git push -u origin main     （注：此操作目的是把本地仓库push到github上面，此步骤需要你输入帐号和密码）
    （9）使用GitHub客户端管理工具管理代码：点击【Add】，选择添加本地文件【Add existing repository】，弹窗地址选择刚刚新生成的android-demo文件。
```

## 目录结构说明
```
android-demo
-.gradle                      放置的是Android Studio自动生成的一些文件，我们无须关心，也不要去手动编辑。
-.idea                        同上。
-app                          项目中的代码、资源等内容几乎都防止在这个目录下，后续的开发工作也基本在这个目录下进行。
  -build                      这个目录和外层的build目录类似，主要也是包含了一些在编译时自动生成的文件，不过它里面的内容会更多更杂，我们不需要过多关心。
  -libs                       如果你的项目中使用到了第三方jar包，就需要把这些jar包都放在libs目录下，放在这个目录下的jar包都会被自动添加到构建路径里去。
  -src                        就是存放java源代码的地方。

    -main
      -java                   毫无疑问，java目录是放置我们所有java代码的地方。
      -res                    这个目录下的内容就有点多了。简单点说，就是你在项目中使用到的所有图片，布局，字符串等资源都要存放在这个目录下。当然这个目录下还有很多子目录，图片放在drawable目录下，布局放在layout目录下，字符串放在values目录下，所以你不用担心会把整个res目录弄得乱糟糟的。
      -AndroidManifest.xml    这是你整个Android项目的配置文件，你在程序中定义的所以四大组件都需要在这个文件里注册，另外还可以在这个文件中给应用程序添加权限声明。
    -AndroidTest              此处是用来编写Android Test测试用例的，可以对项目进行一些自动化测试。
    -test                     此处是用来编写Unit Test测试用例的，是对项目进行自动化测试的另一种方式。
  -.gitignore                 这个文件用于将app模块内的指定的目录或文件排除在版本控制之外，作用和外层的.gitignore文件类似。
  -build.gradle               这是app模块的gradle构建脚本，这个文件中会指定很多项目构建相关的配置。
  -proguard-rules.pro         这个文件用于指定项目代码的混淆规则，当代码开发完成后打成安装包文件，如果不希望代码被别人破解，通常会将代码混淆，从而让破解者难以阅读。
-build                        我们无须过多关心，主要包含了一些在编译时自动生成的文件。
-grade                        包含了gradlle wrapper的配置文件，使用gradle wrapper的方式不需要提前将gradle下载好，而是会自动根据本地的缓存情况决定是否需要联网下载gradle。Android Studio默认没有启动gradle wrapper的方式，如果需要打开，可以点击Android Studio导航栏-->file-->settings-->build,execution,deployment-->gradle，进行配置更改。
-.gitignore                   将指定的目录或文件排除在版本控制之外的。
-build.gradle                 项目全局的gradle构建脚本，通常这个文件中的内容是不需要修改的。
-gradle.properties            这个文件是全局的gradle配置文件，在这里配置的属性将会影响到项目中所有的gradle编译脚本。
-gradlew                      这个文件是用来在命令行界面中执行gradle命令的，其中gradlew是在Linux或Mac系统中使用的，gradlew.bat是在Windows系统中使用的。
-gradlew.bat                  同上。
-local.properties             这个文件用于指定本机中的Android SDK路径，通常内容都是自动生成的，我们并不需要修改。除非你本机中的Android SDK位置发生了变化，那么就将这个文件中的路径改成新的位置即可。
-settings.gradle              这个文件用于指定项目中所有引入的模块。由于android-demo项目中就只有一个app模块，因此该文件中也就只引入了app这一个模块。通常情况下模块的引入都是自动完成的，需要我们手动去修改这个文件的场景可能比较少。

```

## 代码规范
```
```

## OKhttp插件使用
```
1、添加依赖：
    在app\build.gradle文件中，
    dependencies {
        ...
        //OkHttp
        implementation 'com.squareup.okhttp3:okhttp:3.14.2'
        implementation 'com.squareup.okio:okio:1.17.4'
    }
2、在MainActivity文件中增加okhttp的get方法。
3、增加log打印L.java文件。
4、网络请求提示权限问题：
    在\app\src\main\AndroidManifest.xml文件中加入
    <!--由于需要访问网络，但是没有加入访问权限, 在AndroidManifest.xml中加入此网络访问权限就可以了-->
    <uses-permission android:name="android.permission.INTERNET" />
5、调用get方法。
```

## Android-Flat-Button插件使用
```
1、添加依赖：
      在app\build.gradle文件中，
      dependencies {
          ...
          // Android-Flat-Button
          compile 'info.hoang8f:fbutton:1.0.5'
      }
2、将下载下来的4个文件添加到相应的文件/文件夹：
    （1）app\src\main\res\values\attrs.xml
    （2）app\src\main\res\values\colors.xml
    （3）app\src\main\res\values\dimens.xml
    （4）app\src\main\java\com\example\androiddemo\widget\FButton.java
3、修改原始的button标签：
    （1）把xmlns:fbutton=”http://schemas.android.com/apk/res-auto”加入到XML中
    （2）把原来XML中<Button>形式改为info.hoang8f.widget.FButton
    （3）<info.hoang8f.widget.FButton
           ...
          fbutton:buttonColor="@color/color_concrete"
          fbutton:shadowColor="@color/color_asbestos"
          fbutton:shadowEnabled="true"
          fbutton:shadowHeight="5dp"
          fbutton:cornerRadius="5dp"
           ...
         />
```

## 生命周期
```
```

## 页面传值
```
```


