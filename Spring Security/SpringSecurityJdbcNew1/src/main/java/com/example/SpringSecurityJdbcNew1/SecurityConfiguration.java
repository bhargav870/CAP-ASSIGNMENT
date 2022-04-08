package com.example.SpringSecurityJdbcNew1;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Bean;
	import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
	import org.springframework.security.config.annotation.web.builders.HttpSecurity;
	import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
	import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
	import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
	import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

	@EnableWebSecurity
	public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


	    @Autowired
	    DataSource dataSource;
	    //Assigmentq2,3,5
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {    
	          http
	          .authorizeRequests()
	          .antMatchers("/").permitAll()
	          .antMatchers("/admin").hasRole("ADMIN")
	          .antMatchers("/user").hasAnyRole("ADMIN","USER")
	          .and()  
	          .formLogin()  
	          .loginPage("/login")
	          .permitAll()
	          .and()
	          
	          .logout()
	          .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	          .logoutSuccessUrl("/login")
	          .deleteCookies("JSESSIONID")
	          .invalidateHttpSession(true)
	          .permitAll()
	          .and()
	          .rememberMe()
	          .tokenValiditySeconds(2592000)
	          .key("mySecret!")
	          .rememberMeParameter("checkRememberMe");
	          
		}
	    // for q3 we are authenticatig by jdbc

	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

	        auth.jdbcAuthentication()
	        .dataSource(dataSource);
	    }
	    //Assingmentq3
//		@Override
//	    protected void configure(HttpSecurity http) throws Exception{
//	        http.authorizeRequests()
//	                .antMatchers("/admin").hasRole("ADMIN")
//	                .antMatchers("/user").hasAnyRole("ADMIN","USER")
//	                .antMatchers("/").permitAll()
//	                .and().formLogin();  
//	    }

	    @Bean
	    public PasswordEncoder getPasswordEncoder(){
	        return NoOpPasswordEncoder.getInstance();
	    }
	    
//		  @Bean
//		  public PasswordEncoder getPasswordEncoder(){
//		  
//		  return new BCryptPasswordEncoder();
//		  
//		  
//		  }
		 
	    

	}