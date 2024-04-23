//package com.tutorial.student;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;
//
//@Configuration
//@EnableWebSecurity
//public class ApiAuthentication {
//
//    @Bean
//    public AuthenticationManager authenticationManagerBean(HttpSecurity http) throws Exception {
//        AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
////        authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
//        return authenticationManagerBuilder.build();
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        http.csrf().disable().cors().and()
//                .sessionManagement().sessionCreationPolicy(STATELESS)
//                .and().authorizeRequests()
//                .antMatchers("/**").permitAll()
////                .antMatchers(PUBLIC_URLS, "/user/register").permitAll()
////                .antMatchers(PUBLIC_URLS, "/user/add").permitAll()
////                .antMatchers(PUBLIC_URLS, "/user/login").permitAll()
//                .anyRequest().authenticated();
////                .anyRequest().access("@JDBCRoleChecker.check(authentication,request)")
////                .and()
////                .exceptionHandling()
////                .accessDeniedHandler(jwtAccessDeniedHandler)
////                .authenticationEntryPoint(jwtAuthenticationEntryPoint)
////                .and()
////                .addFilterBefore(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);
//        return http.build();
//    }
//}
