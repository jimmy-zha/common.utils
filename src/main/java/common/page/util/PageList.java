package common.page.util;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 包含“分页”信息的<code>List</code>。
 */
public class PageList<E> extends ArrayList<E> implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4323066128057985942L;

    private Paginator         paginator;

    /**
     * 创建一个<code>PageList</code>。
     */
    public PageList()
    {
        paginator = new Paginator();
    }

    /**
     * 创建<code>PageList</code>，并将指定<code>Collection</code>中的内容复制到新的list中。
     *
     * @param c 要复制的<code>Collection</code>
     */
    public PageList(Collection<E> c)
    {
        this(c, null);
    }

    /**
     * 创建<code>PageList</code>，并将指定<code>Collection</code>中的内容复制到新的list中。
     *
     * @param c 要复制的<code>Collection</code>
     */
    public PageList(Collection<E> c, Paginator paginator)
    {
        super(c);
        this.paginator = (paginator == null) ? new Paginator() : paginator;
    }

    /**
     * 取得分页器，可从中取得有关分页和页码的所有信息。
     *
     * @return 分页器对象
     */
    public Paginator getPaginator()
    {
        return paginator;
    }

    /**
     * 设置分页器。
     *
     * @param paginator 要设置的分页器对象
     */
    public void setPaginator(Paginator paginator)
    {
        if (paginator != null)
        {
            this.paginator = paginator;
        }
    }
}
