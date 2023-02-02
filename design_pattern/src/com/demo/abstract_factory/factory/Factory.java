package com.demo.abstract_factory.factory;

/**
 * 抽象工厂
 *
 * @author LiHaoHan
 * @date 2023/2/2
 */
public abstract class Factory {

    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    /**
     * 创建零件
     *
     * @param caption
     * @param url
     * @return
     */
    public abstract Link createLink(String caption, String url);

    /**
     * 创建零件
     *
     * @param caption
     * @return
     */
    public abstract Tray createTray(String caption);

    /**
     * 创建零件
     *
     * @param title
     * @param author
     * @return
     */
    public abstract Page createPage(String title, String author);

}
