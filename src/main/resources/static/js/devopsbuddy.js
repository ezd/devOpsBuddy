$( document ).ready( main );

function main() {

    $('.btn-collapse').click(function(e) {
        e.preventDefault();
        var $this = $(this);
        var $collapse = $this.closest('.collapse-group').find('.collapse');
        $collapse.collapse('toggle');
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