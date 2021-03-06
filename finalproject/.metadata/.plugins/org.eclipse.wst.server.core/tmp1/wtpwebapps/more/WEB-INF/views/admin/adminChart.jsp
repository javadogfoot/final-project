<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin - Chart</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
   <%@ include file="/WEB-INF/views/adminSidebar.jsp"%>
   <h1>
   		<b>CHART</b>
   </h1>
   <br>
   <br>
   <img src="resources/img/achart.png" style="width: 1300px;">
   <!--<div style="padding-left: 1px;">
      <h1>
         <b>Chart</b>
      </h1>
      <br>
      <br>
      <button id="auth-button" onclick="authorize();" hidden>Authorize</button>
      <div id="userschart"></div>
      <br>
      <div id="newuserschart"></div>
      <br>
      <div id="sessionschart"></div>
      <br>
      <div id="bounceRatechart"></div>
      <br>
      <div id="avgSessionDurationchart"></div>
   </div>
   <br>
   <br>-->
</body>
   <script src="https://apis.google.com/js/api.js"></script>
   <script   src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
   <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.css">
   <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
   <script src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
   <script src="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.min.js"></script>
   <!-- <script>
    var gaArr = {
        "More": "ga:257033844",
    };

    var CLIENT_ID = '657321483624-lgt8ag7p42td8e500d8ahbuuel98v3ge.apps.googleusercontent.com';
   var SCOPES = ['https://www.googleapis.com/auth/analytics.readonly'];

     function authorize(event) {
       var useImmdiate = event ? false : true;
       var authData = {
         client_id: CLIENT_ID,
         scope: SCOPES,
         immediate: useImmdiate
       };
       gapi.auth.authorize(authData, function(response) {
         var authButton = document.getElementById('auth-button');
         if (response.error) {
           authButton.hidden = false;
         }
         else {
           authButton.hidden = true;
           queryAccounts();
         }
       });
     }


   function queryAccounts() {
        gapi.client.load('analytics', 'v3').then(function() {
       gapi.client.analytics.management.accounts.list().then(handleAccounts);
     });
   }

   function handleAccounts(response) {
     if (response.result.items && response.result.items.length) {
       var firstAccountId = response.result.items[0].id;
       queryProperties(firstAccountId);
     } else {
       console.log('No accounts found for this user.');
     }
   }

   function queryProperties(accountId) {
     gapi.client.analytics.management.webproperties.list(
         {'accountId': accountId})
       .then(handleProperties)
       .then(null, function(err) {
         console.log(err);
     });
   }

   function handleProperties(response) {
     if (response.result.items && response.result.items.length) {
       var firstAccountId = response.result.items[0].accountId;
       var firstPropertyId = response.result.items[0].id;
       queryProfiles(firstAccountId, firstPropertyId);
     } else {
       console.log('No properties found for this user.');
     }
   }


   function queryProfiles(accountId, propertyId) {
   
     gapi.client.analytics.management.profiles.list({
         'accountId': accountId,
         'webPropertyId': propertyId
     })
     .then(handleProfiles)
     .then(null, function(err) {
         console.log(err);
     });
   }

    function handleProfiles(response) {

        if (response.result.items && response.result.items.length) {

            var firstProfileId = response.result.items[0].id;
            //queryCoreReportingApi(firstProfileId);

            $.each(gaArr, function (key, value) {
                query_ga(key, value);
                query_ga_newusers(key, value);
                query_ga_sessions(key, value);
                query_ga_bounceRate(key, value);
                query_ga_avgSessionDuration(key, value);
            });
        } else {
            console.log('No views (profiles) found for this user.');
        }
    }

    function query_ga(key, value) {
       
       var today = new Date();

      var year = today.getFullYear();
      var month = ('0' + (today.getMonth() + 1)).slice(-2);
      var day = ('0' + today.getDate()).slice(-2);

      var dateString = year + '-' + month  + '-' + day;
      
        gapi.client.analytics.data.ga.get({
            'ids': value,
            'start-date': '2021-12-01',
            'end-date': dateString,
            'metrics': 'ga:users',
            'dimensions': 'ga:date',
            'sort': 'ga:date'
        })
            .then(function (response) {

                var list = new Array();
                $.each(response.result.rows, function (i, j) {
                    var data = new Object();
                    data.key = j[0];
                    data.value = j[1];
                    list.push(data);
                });

                // Json
                var jsonData = JSON.stringify(list);

                if ($("#userschart-" + key).length == 0)
                    $("#userschart").append("<h3>" + key + ": User" +"</h3><div id='userschart-" + key + "'  style='height: 200px;'></div>");

                var chart = new Morris.Line({
                    element: 'userschart-' + key,
                    data: list,
                    xkey: ['key'],
                    ykeys: ['value'],
                    labels: ['Value'],
                    parseTime: false,
                });
            })
            .then(null, function (err) {
                console.log(err);
            });
    }
    
   function query_ga_newusers(key, value) {
       
       var today = new Date();

      var year = today.getFullYear();
      var month = ('0' + (today.getMonth() + 1)).slice(-2);
      var day = ('0' + today.getDate()).slice(-2);

      var dateString = year + '-' + month  + '-' + day;
      
        gapi.client.analytics.data.ga.get({
            'ids': value,
            'start-date': '2021-12-01',
            'end-date': dateString,
            'metrics': 'ga:newUsers',
            'dimensions': 'ga:date',
            'sort': 'ga:date'
        })
            .then(function (response) {

                var list = new Array();
                $.each(response.result.rows, function (i, j) {
                    var data = new Object();
                    data.key = j[0];
                    data.value = j[1];
                    list.push(data);
                });

                // Json
                var jsonData = JSON.stringify(list);

                if ($("#newuserschart-" + key).length == 0)
                    $("#newuserschart").append("<h3>" + key + ": New User" +"</h3><div id='newuserschart-" + key + "'  style='height: 200px;'></div>");

                var chart = new Morris.Line({
                    element: 'newuserschart-' + key,
                    data: list,
                    xkey: ['key'],
                    ykeys: ['value'],
                    labels: ['Value'],
                    parseTime: false,
                });
            })
            .then(null, function (err) {
                console.log(err);
            });
    }
   
   function query_ga_sessions(key, value) {
       
       var today = new Date();

      var year = today.getFullYear();
      var month = ('0' + (today.getMonth() + 1)).slice(-2);
      var day = ('0' + today.getDate()).slice(-2);

      var dateString = year + '-' + month  + '-' + day;
      
        gapi.client.analytics.data.ga.get({
            'ids': value,
            'start-date': '2021-12-01',
            'end-date': dateString,
            'metrics': 'ga:sessions',
            'dimensions': 'ga:date',
            'sort': 'ga:date'
        })
            .then(function (response) {

                var list = new Array();
                $.each(response.result.rows, function (i, j) {
                    var data = new Object();
                    data.key = j[0];
                    data.value = j[1];
                    list.push(data);
                });

                // Json
                var jsonData = JSON.stringify(list);

                if ($("#sessionschart-" + key).length == 0)
                    $("#sessionschart").append("<h3>" + key + ": Sessions" +"</h3><div id='sessionschart-" + key + "'  style='height: 200px;'></div>");

                var chart = new Morris.Line({
                    element: 'sessionschart-' + key,
                    data: list,
                    xkey: ['key'],
                    ykeys: ['value'],
                    labels: ['Value'],
                    parseTime: false,
                });
            })
            .then(null, function (err) {
                console.log(err);
            });
    }
   
   function query_ga_bounceRate(key, value) {
       
       var today = new Date();

      var year = today.getFullYear();
      var month = ('0' + (today.getMonth() + 1)).slice(-2);
      var day = ('0' + today.getDate()).slice(-2);

      var dateString = year + '-' + month  + '-' + day;
      
        gapi.client.analytics.data.ga.get({
            'ids': value,
            'start-date': '2021-12-01',
            'end-date': dateString,
            'metrics': 'ga:bounceRate',
            'dimensions': 'ga:date',
            'sort': 'ga:date'
        })
            .then(function (response) {

                var list = new Array();
                $.each(response.result.rows, function (i, j) {
                    var data = new Object();
                    data.key = j[0];
                    data.value = j[1];
                    list.push(data);
                });

                // Json
                var jsonData = JSON.stringify(list);

                if ($("#bounceRatechart-" + key).length == 0)
                    $("#bounceRatechart").append("<h3>" + key + ": BounceRate" +"</h3><div id='bounceRatechart-" + key + "'  style='height: 200px;'></div>");

                var chart = new Morris.Line({
                    element: 'bounceRatechart-' + key,
                    data: list,
                    xkey: ['key'],
                    ykeys: ['value'],
                    labels: ['Value'],
                    parseTime: false,
                });
            })
            .then(null, function (err) {
                console.log(err);
            });
    }
   
   function query_ga_avgSessionDuration(key, value) {
       
       var today = new Date();

      var year = today.getFullYear();
      var month = ('0' + (today.getMonth() + 1)).slice(-2);
      var day = ('0' + today.getDate()).slice(-2);

      var dateString = year + '-' + month  + '-' + day;
      
        gapi.client.analytics.data.ga.get({
            'ids': value,
            'start-date': '2021-12-01',
            'end-date': dateString,
            'metrics': 'ga:avgSessionDuration',
            'dimensions': 'ga:date',
            'sort': 'ga:date'
        })
            .then(function (response) {

                var list = new Array();
                $.each(response.result.rows, function (i, j) {
                    var data = new Object();
                    data.key = j[0];
                    data.value = j[1];
                    list.push(data);
                });

                // Json
                var jsonData = JSON.stringify(list);

                if ($("#avgSessionDurationchart-" + key).length == 0)
                    $("#avgSessionDurationchart").append("<h3>" + key + ": AvgSessionDuration" +"</h3><div id='avgSessionDurationchart-" + key + "'  style='height: 200px;'></div>");

                var chart = new Morris.Line({
                    element: 'avgSessionDurationchart-' + key,
                    data: list,
                    xkey: ['key'],
                    ykeys: ['value'],
                    labels: ['Value'],
                    parseTime: false,
                });
            })
            .then(null, function (err) {
                console.log(err);
            });
    }
   
    document.getElementById('auth-button').addEventListener('click', authorize);
</script> -->
<script src="https://apis.google.com/js/client.js?onload=authorize"></script>
</html>