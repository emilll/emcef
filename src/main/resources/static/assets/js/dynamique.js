$(document).ready(function(){
  AOS.init();

  $('.ancre').on('click', function(evt){
      evt.preventDefault(); 
      var target = $(this).attr('href');
      $('html, body').stop().animate({scrollTop: $(target).offset().top}, 800 );
  });

  $(window).scroll(function () {
    if ($(this).scrollTop() > 70) {
     $('#navbar').attr('class', 'navbar navbar-expand-lg navbar-light bg-white py-2 fixed-top border-bottom');
     $('#logo').attr('class', 'img-fluid d-block');
     $('#logo-white').attr('class', 'img-fluid d-none');
     $('.style_btn_fixe').removeClass("animated zoomOut");
     $('.style_btn_fixe').addClass("animated bounceInUp");
    } else {

     $('#navbar').attr('class', 'navbar navbar-expand-lg navbar-dark bg-success py-2 fixed-top');
     $('#logo').attr('class', 'img-fluid d-none');
     $('#logo-white').attr('class', 'img-fluid d-block');
     $('.style_btn_fixe').removeClass("animated bounceInUp");
     $('.style_btn_fixe').addClass("animated zoomOut");
    }
  });
});