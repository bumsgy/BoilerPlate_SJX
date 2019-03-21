package com.bp.web.test.controller;

import com.bp.web.comm.controller.BaseController;
import com.bp.web.test.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * The type Test controller.
 */
@Controller
public class TestController extends BaseController {

    @Resource(name="testService")
    private TestService testService;

    /**
     * Test model and view.
     *
     * @param request the request
     * @return the model and view
     */
//    @GetMapping(value="/test")
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ModelAndView test(
        HttpServletRequest request
    ) {
        ModelAndView mav = new ModelAndView();

        testService.test();

        mav.setViewName("/test/test");
        return mav;
    }
}
