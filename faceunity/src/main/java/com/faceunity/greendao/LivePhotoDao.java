package com.faceunity.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.faceunity.entity.LivePhoto;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LIVE_PHOTO".
*/
public class LivePhotoDao extends AbstractDao<LivePhoto, Long> {

    public static final String TABLENAME = "LIVE_PHOTO";

    /**
     * Properties of entity LivePhoto.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Width = new Property(1, int.class, "width", false, "WIDTH");
        public final static Property Height = new Property(2, int.class, "height", false, "HEIGHT");
        public final static Property GroupPointsStr = new Property(3, String.class, "groupPointsStr", false, "GROUP_POINTS_STR");
        public final static Property GroupTypeStr = new Property(4, String.class, "groupTypeStr", false, "GROUP_TYPE_STR");
        public final static Property ImagePath = new Property(5, String.class, "imagePath", false, "IMAGE_PATH");
        public final static Property StickerImagePath = new Property(6, String.class, "stickerImagePath", false, "STICKER_IMAGE_PATH");
        public final static Property Matrix = new Property(7, String.class, "matrix", false, "MATRIX");
        public final static Property AdjustPoints = new Property(8, String.class, "adjustPoints", false, "ADJUST_POINTS");
    }


    public LivePhotoDao(DaoConfig config) {
        super(config);
    }
    
    public LivePhotoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LIVE_PHOTO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"WIDTH\" INTEGER NOT NULL ," + // 1: width
                "\"HEIGHT\" INTEGER NOT NULL ," + // 2: height
                "\"GROUP_POINTS_STR\" TEXT," + // 3: groupPointsStr
                "\"GROUP_TYPE_STR\" TEXT," + // 4: groupTypeStr
                "\"IMAGE_PATH\" TEXT," + // 5: imagePath
                "\"STICKER_IMAGE_PATH\" TEXT," + // 6: stickerImagePath
                "\"MATRIX\" TEXT," + // 7: matrix
                "\"ADJUST_POINTS\" TEXT);"); // 8: adjustPoints
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LIVE_PHOTO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LivePhoto entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getWidth());
        stmt.bindLong(3, entity.getHeight());
 
        String groupPointsStr = entity.getGroupPointsStr();
        if (groupPointsStr != null) {
            stmt.bindString(4, groupPointsStr);
        }
 
        String groupTypeStr = entity.getGroupTypeStr();
        if (groupTypeStr != null) {
            stmt.bindString(5, groupTypeStr);
        }
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(6, imagePath);
        }
 
        String stickerImagePath = entity.getStickerImagePath();
        if (stickerImagePath != null) {
            stmt.bindString(7, stickerImagePath);
        }
 
        String matrix = entity.getMatrix();
        if (matrix != null) {
            stmt.bindString(8, matrix);
        }
 
        String adjustPoints = entity.getAdjustPoints();
        if (adjustPoints != null) {
            stmt.bindString(9, adjustPoints);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LivePhoto entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getWidth());
        stmt.bindLong(3, entity.getHeight());
 
        String groupPointsStr = entity.getGroupPointsStr();
        if (groupPointsStr != null) {
            stmt.bindString(4, groupPointsStr);
        }
 
        String groupTypeStr = entity.getGroupTypeStr();
        if (groupTypeStr != null) {
            stmt.bindString(5, groupTypeStr);
        }
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(6, imagePath);
        }
 
        String stickerImagePath = entity.getStickerImagePath();
        if (stickerImagePath != null) {
            stmt.bindString(7, stickerImagePath);
        }
 
        String matrix = entity.getMatrix();
        if (matrix != null) {
            stmt.bindString(8, matrix);
        }
 
        String adjustPoints = entity.getAdjustPoints();
        if (adjustPoints != null) {
            stmt.bindString(9, adjustPoints);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public LivePhoto readEntity(Cursor cursor, int offset) {
        LivePhoto entity = new LivePhoto( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // width
            cursor.getInt(offset + 2), // height
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // groupPointsStr
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // groupTypeStr
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // imagePath
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // stickerImagePath
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // matrix
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // adjustPoints
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LivePhoto entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setWidth(cursor.getInt(offset + 1));
        entity.setHeight(cursor.getInt(offset + 2));
        entity.setGroupPointsStr(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setGroupTypeStr(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setImagePath(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setStickerImagePath(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setMatrix(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setAdjustPoints(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(LivePhoto entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(LivePhoto entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LivePhoto entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}