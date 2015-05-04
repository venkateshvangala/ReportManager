module.exports = function(grunt){
	grunt.initConfig({
		pkg: grunt.file.readJSON('package.json'),
	    sass: {
			dist: {
				options: {
					sourceMap: false
				},
				files: {
					'public/src/css/app/main.css'   : 'public/src/css/lib/main.scss',
					'public/src/css/app/styles.css' : 'public/src/css/app/styles.scss'
				}
			}
		},
		
		concat: {
			options:{
				stripBanners: true,
				banner: '/*! <%= pkg.name %> - v<%= pkg.version %> - ' +
		        '<%= grunt.template.today("yyyy-mm-dd") %> */',
		        separator: ';'
			},
			dist: {
				src: ['public/src/css/**/*.css'],
				dest: 'public/src/css/combined.css'
			}
		},
		
		watch : {
			css : {
				files : 'public/src/css/**/*.scss',
				tasks : ['sass', 'concat']
			}
		}
	});
	
	grunt.loadNpmTasks("grunt-contrib-sass");
	grunt.loadNpmTasks("grunt-contrib-concat");
	grunt.loadNpmTasks("grunt-contrib-watch");
	grunt.registerTask('default', ['watch']);
}