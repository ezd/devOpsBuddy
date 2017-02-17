$( document ).ready( main );

function main() {

    $('.btn-collapse').click(function(e) {
        e.preventDefault();
        var $this = $(this);
        var $collapse = $this.closest('.collapse-group').find('.collapse');
        $collapse.collapse('toggle');
    });
    
    $('#signupForm').validate({
    	rules:{
    		username:"required",
    		email:"required",
    		password:"required",
    		firstName:"required",
    		lastName:"required",
    		description:"required",
    		country:"required",
    		phoneNumber:"required"
    	},
    	messages:{
    		username:"User name is required",
    		email:"Email is required",
    		password:"Password is required",
    		firstName:"First name is required",
    		lastName:"last name is required",
    		description:"Description is required",
    		country:"Country is required",
    		phoneNumber:"Phone number is required"
    	}
    });
    
    $('#contactForm').validate({
    	rules:{
    		email:{
    			required:true,
    			email:true
    		},
    		firstName:"required",
    		lastName:"required",
    		feedback:"required"
    	},
    	messages:{
    		email:{
    			required:"Email is required",
    			email:"Please insert valid email"
    		},
    		firstName:"First name is required",
    		lastName:"Last name is required",
    		feedback:"Your feedback is valuable for us"
    	}
    });
    
    

}