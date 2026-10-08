package f;

import cn.pokemmo.ui.widget.page.PaginationController;

/**
 * 兼容垫片 (Shim) - 页面多页列表分页控制器 (Pagination Controller)
 * 实际实现已迁移至 {@link PaginationController}
 */
public abstract class V1 extends PaginationController {
    public V1(int pageSize, int visiblePages) {
        super(pageSize, visiblePages);
    }
    public V1(int pageSize, int visiblePages, boolean padPages) {
        super(pageSize, visiblePages, padPages);
    }
}
