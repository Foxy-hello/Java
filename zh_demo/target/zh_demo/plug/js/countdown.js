function countdown(obj){
		var that = $(obj);
		 var seconds = 120;
		 that.attr("disabled", true);
		 that.val(seconds+'秒');
	     let promise = new Promise((resolve, reject) => {
	      let setTimer = setInterval(
	        () => {
	          seconds -= 1;
	          // console.info('倒计时:' + seconds);
	          that.val(seconds+'秒');
	          if (seconds <= 0) {
	          	that.val('获取短信验证码');
	            resolve(setTimer)
	          }
	        }
	        , 1000)
	    })
	    promise.then((setTimer) => {
	       // console.info('清除');
	      clearInterval(setTimer);
	      that.attr("disabled", false);
	    })   
	}