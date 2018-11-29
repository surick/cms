package com.jieweifu.services.cms;

import com.jieweifu.models.cms.About;

/**
 * @author Jin
 * @date 2018/11/22
 */
public interface AboutService {
    /**
     * 存
     * @param about
     */
    void saveAbout(About about);

    /**
     * 改
     * @param about
     */
    void updateAbout(About about);

    /**
     * 查
     * @param type
     * @return
     */
    About getAbout(Integer type);
}
