var exec = require('cordova/exec');

exports.init = function(isDebug, success, error) {
    exec(success, error, "BuglyUpgrade", "init", [isDebug]);
};
