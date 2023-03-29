// animation slide splashscreen
setTimeout(function() {
    $('.preloader').slideUp(2000);
    $('.loading-img').delay(150).slideUp('fast');
}, 4000);
// animation slide splashscreen

function regist(){
    var nama = document.getElementById("nama").value;
    var email = document.getElementById("email").value;
    var message = document.getElementById("message").value;
    
    var output =  
        "Name : " + nama + "\n"  +
        "Email : " + email + "\n" +
        "Message : " + message;

    alert(output);
}

//Responsive Navbar
$(function() {
    $(".toggle").on("click", function(){
        if($(".item").hasClass("active")){
            $(".item").removeClass("active");
        }
        else {
            $(".item").addClass("active");
        }
    });
});

function comparePassword(){
    var pw1 = document.getElementById("password").value;
    var pw2 = document.getElementById("password2").value;
    if(pw1 !== pw2){
        alert("Password tidak sama!!");
        document.getElementById("password2").value="";
    }else{
        return true;
    }
}
