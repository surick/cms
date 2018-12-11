(function(){ 
    var log = console.log.bind(console)
    var CONFIG = {
        默认语言: 'zh'
    }
    var loadModules = function(callback) {
        var scriptSrcList = [
            '/js/i18n/jquery.i18n.js',
            '/js/i18n/jquery.i18n.messagestore.js',
            '/js/i18n/jquery.i18n.fallbacks.js',
            '/js/i18n/jquery.i18n.language.js',
            '/js/i18n/jquery.i18n.parser.js',
            '/js/i18n/jquery.i18n.emitter.js',
        ]
        var totalScriptNum = 0
        for (var index = 0; index < scriptSrcList.length; index++) {
            var src = scriptSrcList[index]
            var script = document.createElement('script')
            script.src = src
            script.onload = function() {
                totalScriptNum += 1
                if (totalScriptNum === scriptSrcList.length) {
                    callback();
                }
            }
            document.body.appendChild(script)
        }
    }

    var setLocalTo = function(locale) {
        var cookieName = 'jquery-i18n-locale'
        var DEFAULT_LOCALE = CONFIG.默认语言
        if (locale) {
            $.i18n().locale = locale;
            localStorage.setItem(cookieName, locale);
        } else {
            $.i18n().locale = localStorage.getItem(cookieName) || DEFAULT_LOCALE;
        }
    }

    var addLocaleChangeButton = function() {
        $('#header').append('\
            <div class="lang-switch" style="position:absolute; right:-100px;top:42%;font-size: 16px;\
            color: #b3a57c;cursor: pointer;" data-i18n="切换语言"></div>\
        ')
        $('.lang-switch').bind('click', function (e) {
            var locale = 'zh'
            if ($.i18n().locale === 'zh') {
                locale = 'en'
            }
            setLocalTo(locale);
            console.log('$.i18n().locale', $.i18n().locale)
            $('html').i18n();
        });
    }

    loadModules(function() {
        $.i18n().load({
            'en': '/js/i18n/cn.json',
            'zh': '/js/i18n/zh.json'
        }).done(function () {
            setLocalTo()
            $('.switch-locale a').bind('click', function (e) {
                e.preventDefault();
                setLocalTo($(this).attr('data-locale'));
                $('html').i18n();
            });
            addLocaleChangeButton();
            $('html').i18n();
        });
    })
}());