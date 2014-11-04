var appInfo = angular.module('appInfo', ['ngResource', 'ui.bootstrap'])

appInfo.controller('AppInfoController', function ($scope, $http) {
    $scope.versions = ['1', '2', '3', '4']
    
    $scope.postInfo = function () {
    	$http.post('/service/api/putAppInfo', {name: $scope.app.name, version: $scope.app.version, description: $scope.app.description}).
    	  success(function(data, status, headers, config) {
    		  $scope.response = data;
    	  }).
    	  error(function(data, status, headers, config) {
    		  alert('Failure!');
    	  });
    };
});