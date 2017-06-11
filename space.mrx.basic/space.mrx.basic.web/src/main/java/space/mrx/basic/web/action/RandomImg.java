package space.mrx.basic.web.action;

/*
 * Project: adminPlatform
 * 
 * File Created at 2017年4月19日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.google.code.kaptcha.Constants;
//import com.google.code.kaptcha.Producer;

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2017年4月19日 wangmengjun creat
 */

@Controller
public class RandomImg {
//    @Autowired
//    private Producer captchaProducer;

    @RequestMapping("/user/image")
    public ModelAndView getKaptchaImage(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//        response.setDateHeader("Expires", 0);
//        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
//        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
//        response.setHeader("Pragma", "no-cache");
//        response.setContentType("image/jpeg");
//        String capText = captchaProducer.createText();
//        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
////        this.putToSession(request, Constants.KAPTCHA_SESSION_KEY, capText);
//        BufferedImage bi = captchaProducer.createImage(capText);
//        ServletOutputStream out = response.getOutputStream();
//        ImageIO.write(bi, "jpg", out);
//        try {
//            out.flush();
//        } finally {
//            out.close();
//        }
        return null;
    }
}
