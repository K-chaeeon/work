// 카카오 로그인 설정
Kakao.init('YOUR_APP_KEY'); // 카카오 앱 키를 입력하세요

// 카카오 로그인 버튼 클릭 이벤트 핸들러
document.getElementById('kakao-login-btn').addEventListener('click', function() {
    Kakao.Auth.login({
        success: function(authObj) {
            console.log(authObj);
            // 로그인 성공 후 처리 로직
        },
        fail: function(err) {
            console.error(err);
            // 로그인 실패 후 처리 로직
        }
    });
});

document.getElementById('login-btn').addEventListener('click', function() {
    document.getElementById('login-form').classList.add('active');
    document.getElementById('signup-form').classList.remove('active');
    document.getElementById('guest-inquiry-form').classList.remove('active');
    this.classList.add('active');
    document.getElementById('signup-btn').classList.remove('active');
    document.getElementById('guest-inquiry-btn').classList.remove('active');
});

document.getElementById('signup-btn').addEventListener('click', function() {
    document.getElementById('signup-form').classList.add('active');
    document.getElementById('login-form').classList.remove('active');
    document.getElementById('guest-inquiry-form').classList.remove('active');
    this.classList.add('active');
    document.getElementById('login-btn').classList.remove('active');
    document.getElementById('guest-inquiry-btn').classList.remove('active');
});

document.getElementById('guest-inquiry-btn').addEventListener('click', function() {
    document.getElementById('guest-inquiry-form').classList.add('active');
    document.getElementById('login-form').classList.remove('active');
    document.getElementById('signup-form').classList.remove('active');
    this.classList.add('active');
    document.getElementById('login-btn').classList.remove('active');
    document.getElementById('signup-btn').classList.remove('active');
});
