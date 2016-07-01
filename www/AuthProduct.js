var exec = require('cordova/exec');

exports.authenticate = function(arg0, success, error) {
    exec(success, error, "AuthProduct", "authenticate", [arg0]);
};
