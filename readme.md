# Cordova-Plugin-Bugly-Upgrade

## 使用
首先在config.xml中加入：

```
<preference name="BuglyAppId" value="你注册的appid"></preference>
```

调用：

```
BuglyUpgrade.init(debug, callback);
```
- debug:是否开启debug模式（boolean)
