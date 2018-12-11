$(document).ready(function() {
    var onetitle = $(".FrontPublic_breadCrumb01-d2_c1 .cycle2 a").text();
    var twotitle = $(".FrontPublic_breadCrumb01-d2_c1 .cycle3 a").text();
    if (onetitle != "") {
        $(".sitemap").text(onetitle);
    }
    if (onetitle != "" && twotitle != "") {
        $(".sitemap").text(twotitle);
    }

    if (onetitle == "" && twotitle == "") {
        $(".sitemap").text("PRODUCTS");
    }
    //取出产品中心图片路径遍历循环
    $(".FrontProducts_list01-d1_c1 .pic-module .pic a").each(function() {
        $(this).attr("href", $(this).children("img").attr("src"));
    })
    $(".FrontProducts_list01-d1_c1 .pro-module .basic a").each(function() {
        $(this).attr("href", $(this).parent().parent().parent().parent().parent().parent().children().children().children().children("img").attr("src"));
    })

    $('li.content .pic-module a').lightBox();
    $('li.content .basic a').lightBox();
})