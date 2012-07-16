package org.ebookdroid.common.settings.definitions;

import static org.ebookdroid.R.string.*;

import org.ebookdroid.common.settings.base.BooleanPreferenceDefinition;
import org.ebookdroid.common.settings.base.EnumPreferenceDefinition;
import org.ebookdroid.common.settings.base.IntegerPreferenceDefinition;
import org.ebookdroid.common.settings.base.StringPreferenceDefinition;
import org.ebookdroid.common.settings.types.DocumentViewMode;
import org.ebookdroid.common.settings.types.DocumentViewType;
import org.ebookdroid.common.settings.types.FontSize;
import org.ebookdroid.common.settings.types.PageAlign;
import org.ebookdroid.common.settings.types.RotationType;
import org.ebookdroid.common.settings.types.ToastPosition;
import org.ebookdroid.core.curl.PageAnimationType;

public interface AppPreferences {

    /* =============== UI settings =============== */

    BooleanPreferenceDefinition LOAD_RECENT = new BooleanPreferenceDefinition(pref_loadrecent_id,
            pref_loadrecent_defvalue);

    BooleanPreferenceDefinition CONFIRM_CLOSE = new BooleanPreferenceDefinition(pref_confirmclose_id,
            pref_confirmclose_defvalue);

    BooleanPreferenceDefinition BRIGHTNESS_NIGHT_MODE_ONLY = new BooleanPreferenceDefinition(
            pref_brightnessnightmodeonly_id, pref_brightnessnightmodeonly_defvalue);

    IntegerPreferenceDefinition BRIGHTNESS = new IntegerPreferenceDefinition(pref_brightness_id,
            pref_brightness_defvalue, pref_brightness_minvalue, pref_brightness_maxvalue);

    BooleanPreferenceDefinition KEEP_SCREEN_ON = new BooleanPreferenceDefinition(pref_keepscreenon_id,
            pref_keepscreenon_defvalue);

    EnumPreferenceDefinition<RotationType> ROTATION = new EnumPreferenceDefinition<RotationType>(RotationType.class,
            pref_rotation_id, pref_rotation_auto);

    BooleanPreferenceDefinition FULLSCREEN = new BooleanPreferenceDefinition(pref_fullscreen_id,
            pref_fullscreen_defvalue);

    BooleanPreferenceDefinition SHOW_TITLE = new BooleanPreferenceDefinition(pref_title_id, pref_title_defvalue);

    BooleanPreferenceDefinition SHOW_PAGE_IN_TITLE = new BooleanPreferenceDefinition(pref_pageintitle_id,
            pref_pageintitle_defvalue);

    EnumPreferenceDefinition<ToastPosition> PAGE_NUMBER_TOAST_POSITION = new EnumPreferenceDefinition<ToastPosition>(
            ToastPosition.class, pref_pagenumbertoastposition_id, pref_toastposition_lefttop);

    EnumPreferenceDefinition<ToastPosition> ZOOM_TOAST_POSITION = new EnumPreferenceDefinition<ToastPosition>(
            ToastPosition.class, pref_zoomtoastposition_id, pref_toastposition_leftbottom);

    BooleanPreferenceDefinition SHOW_ANIM_ICON = new BooleanPreferenceDefinition(pref_showanimicon_id,
            pref_showanimicon_defvalue);

    IntegerPreferenceDefinition LINK_HIGHLIGHT_COLOR = new IntegerPreferenceDefinition(pref_link_highlight_id,
            pref_link_highlight_defvalue);

    IntegerPreferenceDefinition SEARCH_HIGHLIGHT_COLOR = new IntegerPreferenceDefinition(pref_search_highlight_id,
            pref_search_highlight_defvalue);

    IntegerPreferenceDefinition CURRENT_SEARCH_HIGHLIGHT_COLOR = new IntegerPreferenceDefinition(
            pref_current_search_highlight_id, pref_current_search_highlight_defvalue);

    BooleanPreferenceDefinition STORE_GOTO_HISTORY = new BooleanPreferenceDefinition(pref_storeGotoHistory_id,
            pref_storeGotoHistory_defvalue);

    BooleanPreferenceDefinition STORE_LINK_GOTO_HISTORY = new BooleanPreferenceDefinition(pref_storeLinkGotoHistory_id,
            pref_storeLinkGotoHistory_defvalue);

    BooleanPreferenceDefinition STORE_OUTLINE_GOTO_HISTORY = new BooleanPreferenceDefinition(
            pref_storeOutlineGotoHistory_id, pref_storeOutlineGotoHistory_defvalue);

    BooleanPreferenceDefinition STORE_SEARCH_GOTO_HISTORY = new BooleanPreferenceDefinition(
            pref_storeSearchGotoHistory_id, pref_storeSearchGotoHistory_defvalue);

    /* =============== Tap & Scroll settings =============== */

    BooleanPreferenceDefinition TAPS_ENABLED = new BooleanPreferenceDefinition(pref_tapsenabled_id,
            pref_tapsenabled_defvalue);

    IntegerPreferenceDefinition SCROLL_HEIGHT = new IntegerPreferenceDefinition(pref_scrollheight_id,
            pref_scrollheight_defvalue, pref_scrollheight_minvalue, pref_scrollheight_maxvalue);

    IntegerPreferenceDefinition TOUCH_DELAY = new IntegerPreferenceDefinition(pref_touchdelay_id,
            pref_touchdelay_defvalue, pref_touchdelay_minvalue, pref_touchdelay_maxvalue);

    BooleanPreferenceDefinition ANIMATE_SCROLLING = new BooleanPreferenceDefinition(pref_animate_scrolling_id,
            pref_animate_scrolling_defvalue);

    /* =============== Tap & Keys settings =============== */

    StringPreferenceDefinition TAP_PROFILES = new StringPreferenceDefinition(pref_tapprofiles_id,
            pref_tapprofiles_defvalue);

    StringPreferenceDefinition KEY_BINDINGS = new StringPreferenceDefinition(pref_keys_binding_id,
            pref_keys_binding_defvalue);

    /* =============== Performance settings =============== */

    IntegerPreferenceDefinition PAGES_IN_MEMORY = new IntegerPreferenceDefinition(pref_pagesinmemory_id,
            pref_pagesinmemory_defvalue, pref_pagesinmemory_minvalue, pref_pagesinmemory_maxvalue);

    EnumPreferenceDefinition<DocumentViewType> VIEW_TYPE = new EnumPreferenceDefinition<DocumentViewType>(
            DocumentViewType.class, pref_docviewtype_id, pref_docviewtype_surface);

    IntegerPreferenceDefinition DECODING_THREADS = new IntegerPreferenceDefinition(pref_decoding_threads_id,
            pref_decoding_threads_defvalue, pref_decoding_threads_minvalue, pref_decoding_threads_maxvalue);

    IntegerPreferenceDefinition DECODE_THREAD_PRIORITY = new IntegerPreferenceDefinition(pref_decodethread_priority_id,
            pref_thread_priority_normal, pref_thread_priority_lowest, pref_thread_priority_highest);

    IntegerPreferenceDefinition DRAW_THREAD_PRIORITY = new IntegerPreferenceDefinition(pref_drawthread_priority_id,
            pref_thread_priority_normal, pref_thread_priority_lowest, pref_thread_priority_highest);

    BooleanPreferenceDefinition USE_NATIVE_GRAPHICS = new BooleanPreferenceDefinition(pref_usenativegraphics_id,
            pref_usenativegraphics_defvalue);

    BooleanPreferenceDefinition HWA_ENABLED = new BooleanPreferenceDefinition(pref_hwa_enabled_id,
            pref_hwa_enabled_defvalue);

    IntegerPreferenceDefinition BITMAP_SIZE = new IntegerPreferenceDefinition(pref_bitmapsize_id, pref_bitmapsize_128,
            pref_bitmapsize_64, pref_bitmapsize_1024);

    BooleanPreferenceDefinition BITMAP_FILTERING = new BooleanPreferenceDefinition(pref_bitmapfilering_enabled_id,
            pref_bitmapfilering_enabled_defvalue);

    BooleanPreferenceDefinition REUSE_TEXTURES = new BooleanPreferenceDefinition(pref_texturereuse_id,
            pref_texturereuse_defvalue);

    BooleanPreferenceDefinition USE_BITMAP_HACK = new BooleanPreferenceDefinition(pref_bitmaphack_id,
            pref_bitmaphack_defvalue);

    BooleanPreferenceDefinition EARLY_RECYCLING = new BooleanPreferenceDefinition(pref_earlyrecycling_id,
            pref_earlyrecycling_defvalue);

    BooleanPreferenceDefinition RELOAD_DURING_ZOOM = new BooleanPreferenceDefinition(pref_reloadduringzoom_id,
            pref_reloadduringzoom_defvalue);

    IntegerPreferenceDefinition HEAP_PREALLOCATE = new IntegerPreferenceDefinition(pref_heappreallocate_id,
            pref_heappreallocate_defvalue, pref_heappreallocate_minvalue, pref_heappreallocate_maxvalue);

    IntegerPreferenceDefinition PDF_STORAGE_SIZE = new IntegerPreferenceDefinition(pref_pdfstoragesize_id,
            pref_pdfstoragesize_defvalue, pref_pdfstoragesize_minvalue, pref_pdfstoragesize_maxvalue);

    /* =============== Default rendering settings =============== */

    BooleanPreferenceDefinition NIGHT_MODE = new BooleanPreferenceDefinition(pref_nightmode_id, pref_nightmode_defvalue);

    IntegerPreferenceDefinition CONTRAST = new IntegerPreferenceDefinition(pref_contrast_id, pref_contrast_defvalue,
            pref_contrast_minvalue, pref_contrast_maxvalue);

    IntegerPreferenceDefinition EXPOSURE = new IntegerPreferenceDefinition(pref_exposure_id, pref_exposure_defvalue,
            pref_exposure_minvalue, pref_exposure_maxvalue);

    BooleanPreferenceDefinition AUTO_LEVELS = new BooleanPreferenceDefinition(pref_autolevels_id,
            pref_autolevels_defvalue);

    BooleanPreferenceDefinition SPLIT_PAGES = new BooleanPreferenceDefinition(pref_splitpages_id,
            pref_splitpages_defvalue);

    BooleanPreferenceDefinition CROP_PAGES = new BooleanPreferenceDefinition(pref_croppages_id, pref_croppages_defvalue);

    EnumPreferenceDefinition<DocumentViewMode> VIEW_MODE = new EnumPreferenceDefinition<DocumentViewMode>(
            DocumentViewMode.class, pref_viewmode_id, pref_viewmode_vertical_scroll);

    EnumPreferenceDefinition<PageAlign> PAGE_ALIGN = new EnumPreferenceDefinition<PageAlign>(PageAlign.class,
            pref_align_id, pref_align_by_width);

    EnumPreferenceDefinition<PageAnimationType> ANIMATION_TYPE = new EnumPreferenceDefinition<PageAnimationType>(
            PageAnimationType.class, pref_animation_type_id, pref_animation_type_none);

    /* =============== Format-specific settings =============== */

    IntegerPreferenceDefinition DJVU_RENDERING_MODE = new IntegerPreferenceDefinition(pref_djvu_rendering_mode_id,
            pref_djvu_rendering_mode_0, pref_djvu_rendering_mode_0, pref_djvu_rendering_mode_5);

    BooleanPreferenceDefinition PDF_CUSTOM_DPI = new BooleanPreferenceDefinition(pref_customdpi_id,
            pref_customdpi_defvalue);

    IntegerPreferenceDefinition PDF_CUSTOM_XDPI = new IntegerPreferenceDefinition(pref_xdpi_id, pref_xdpi_defvalue,
            pref_xdpi_minvalue, pref_xdpi_maxvalue);

    IntegerPreferenceDefinition PDF_CUSTOM_YDPI = new IntegerPreferenceDefinition(pref_ydpi_id, pref_ydpi_defvalue,
            pref_ydpi_minvalue, pref_ydpi_maxvalue);

    EnumPreferenceDefinition<FontSize> FB2_FONT_SIZE = new EnumPreferenceDefinition<FontSize>(FontSize.class,
            pref_fontsize_id, pref_fontsize_normal);

    BooleanPreferenceDefinition FB2_HYPHEN = new BooleanPreferenceDefinition(pref_fb2hyphen_id, pref_fb2hyphen_defvalue);

    BooleanPreferenceDefinition FB2_CACHE_IMAGES = new BooleanPreferenceDefinition(pref_fb2cacheimages_id, pref_fb2cacheimages_defvalue);

    /* =============== Backup settings =============== */

    BooleanPreferenceDefinition BACKUP_ON_EXIT = new BooleanPreferenceDefinition(pref_backuponexit_id,
            pref_backuponexit_defvalue);

    BooleanPreferenceDefinition BACKUP_ON_BOOK_CLOSE = new BooleanPreferenceDefinition(pref_backuponbookclose_id,
            pref_backuponbookclose_defvalue);

}
