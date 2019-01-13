package com.example.bgmanagejpa.util;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Clock;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * jwt工具类
 */
public class JwtUtil {
    /**
     * 加密盐值
     */
    private static final String SECRET="MYSCRECT";
    private static final String PAYLOAD = "payload";
    private static final String EXP = "exp";

    /**
     * 生成token
     * @param object 生成token的对象
     * @param maxAge token 的存活时间
     * @return
     */
    public static<T> String createToken(T object, long maxAge ){
        Algorithm algorithm = Algorithm.HMAC256(SECRET);
        LocalDateTime localDate = LocalDateTime.now().plusSeconds(maxAge);
        Date expireTime = Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant());
        String token = "";
        token = JWT.create()
                .withIssuer("auth0")
                .withSubject("mySubject")
                .withClaim("userId",object.toString())
                .withExpiresAt(expireTime)
                .sign(algorithm);
        return token;
    }

    /**
     * 解码token
     * @param token
     * @return
     */
    public static Boolean decodeToken(String token){
        Algorithm algorithm = Algorithm.HMAC256(SECRET);
        JWTVerifier.BaseVerification verification = (JWTVerifier.BaseVerification) JWT.require(algorithm)
                .withIssuer("auth0")
                .withSubject("mySubject");
        Clock clock = new Clock() {
            @Override
            public Date getToday() {
                return new Date();
            }
        };
        JWTVerifier verifier = verification.build(clock);
        DecodedJWT decodedJWT = verifier.verify(token);
        System.out.println(decodedJWT.getClaim("userId").asLong());
        return true;
    }
}
