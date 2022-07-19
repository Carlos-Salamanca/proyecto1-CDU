package co.edu.unicauca.adminCDU.security;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//@EnableWebSecurity
public class SecurityConfiguration /*extends WebSecurityConfigurerAdapter*/{
	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//        .authorizeRequests()
//                .regexMatchers("/admin/.\*").hasRole("ADMIN")
//                .regexMatchers("/user/.\*").authenticated()
//            .anyRequest()
//                .permitAll()
//                .and()
//        .formLogin();
//    }
	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/login").permitAll()
//	        .antMatchers("/users/**", "/settings/**").hasAuthority("Admin")
//	        .hasAnyAuthority("Admin", "Editor", "Salesperson")
//	        .hasAnyAuthority("Admin", "Editor", "Salesperson", "Shipper")
//	        .anyRequest().authenticated()
//	        .and().formLogin()
//	        .loginPage("/login")
//	            .usernameParameter("email")
//	            .permitAll()
//	        .and()
//	        .rememberMe().key("AbcdEfghIjklmNopQrsTuvXyz_0123456789")
//	        .and()
//        .logout().permitAll();
//
//		http.headers().frameOptions().sameOrigin();	
//		
//		return http.build();
//	}
}
