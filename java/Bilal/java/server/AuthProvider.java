package Bilal.java.server;

//AuthProvider.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import Bilal.java.server.users.Users;
import Bilal.java.server.users.userRepository;

import java.util.Arrays;

@Component
public class AuthProvider implements AuthenticationProvider {

    @Autowired
    private userRepository userRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        String firstName = authentication.getCredentials().toString();

        Users user = userRepo.findByUsername(email);
    	System.out.println("This is before checking if it matches or not (we r in AuthProvider)" + firstName);
        
        if (user != null && passwordEncoder.matches(firstName, user.getfirstName())) {
        	System.out.println("sucessful");
            return new UsernamePasswordAuthenticationToken(email, firstName, Arrays.asList());
        } else {
        	System.out.println("after invalid (in AuthProvider.java) and password is: "+ firstName);
            throw new BadCredentialsException("Invalid username or password");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}