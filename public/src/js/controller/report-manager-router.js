define(['jquery', 'underscore', 'backbone'], function($, _, Backbone){
	var self, ReportManagerRouter = Backbone.Router.extend({

		initialize : function(options){
			Backbone.history.start();
			var self = this;
		},
		
		routes : {
			"" : 'renderHome'
		},
		
		renderHome : function(){
			console.log("test Render Home");
		}
	});
	return ReportManagerRouter;
});