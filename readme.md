# Cordova-Plugin-Bugly-Upgrade

## 使用

首先在config.xml中加入：

```
<preference name="BuglyAppId" value="你注册的appid"></preference>
```

_app运行时会自动检查更新_

手动检查更新：

```
BuglyUpgrade.checkUpgrade(, callback);
```

