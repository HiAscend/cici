/**
 * 
 * Created by adeng on 2016/8/13.
 */
$(function(){
    $('.link .button').hover(function(){
        var title = $(this).attr('data');
        $('.tip em').text(title);
        var position = $(this).position();//于返回当前匹配元素相对于其被定位的祖辈元素的偏移
        var pos = position.left+12.5;
        var tipWidth = $('.tip').outerWidth();
        var buttonWidth = $(this).outerWidth();
        var distance = 0;
        if(tipWidth>buttonWidth){
            distance = (tipWidth-buttonWidth)/2;
        }else {
            distance = (buttonWidth-tipWidth)/2;
        }
        var realLeft = pos-distance;
        console.log('pos'+pos);
        console.log('tipWidth'+tipWidth);
        console.log('buttonWidth'+buttonWidth);
        console.log('distance'+distance);
        console.log('realLeft'+realLeft);
        console.log('#############');
        // $('.tip').css({'opacity':1,'left':realLeft+'px'});
        $('.tip').css({'left':realLeft+'px'}).animate({'top':'140px','opacity':1},500);
    },function () {
       /*if(!$('.tip').is(':animated')){
           $('.tip').animate({'top':100,'opacity':0},500);
       }*/
        $('.tip').stop(true,false).animate({'top':100,'opacity':0},500);
    });
});
