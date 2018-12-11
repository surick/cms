$(document).ready(function() {

    var onetitle = $(".FrontPublic_breadCrumb01-d2_c1 .cycle2 a").text();

    var twotitle = $(".FrontPublic_breadCrumb01-d2_c1 .cycle3 a").text();

    if (onetitle != "")

    {

        $(".sitemap").text(onetitle);

    }

    if (onetitle != "" && twotitle != "")

    {

        $(".sitemap").text(twotitle);

    }

    if (onetitle == "" && twotitle == "")

    {

        $(".sitemap").text("PRODUCTS");

    }

    //取出产品中心图片路径遍历循环

})