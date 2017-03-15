var exec = require('cordova/exec');

exports.checkUpgrade = function(success, error) {
    exec(success, error, "BuglyUpgrade", "checkUpgrade");
};

exports.getUpgradeInfo =function(success, error) {
    exec(success, error, "BuglyUpgrade", "getUpgradeInfo");
}