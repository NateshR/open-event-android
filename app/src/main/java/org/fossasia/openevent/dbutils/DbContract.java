package org.fossasia.openevent.dbutils;

import android.provider.BaseColumns;

/**
 * Created by championswimmer on 17/5/15.
 */
public class DbContract {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "OpenEvent.db";
    private static final String TEXT_TYPE = " TEXT";
    private static final String INT_TYPE = " INTEGER";
    private static final String REAL_TYPE = " REAL";
    private static final String COMMA_SEP = ",";

    public DbContract() {
        //Empty constructor to prevent object creation.
    }

    public static abstract class Speakers implements BaseColumns {
        public static final String TABLE_NAME = "speakers";
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String PHOTO = "photo";
        public static final String BIO = "bio";
        public static final String EMAIL = "email";
        public static final String WEB = "web";
        public static final String FACEBOOK = "facebook";
        public static final String TWITTER = "twitter";
        public static final String GITHUB = "github";
        public static final String LINKEDIN = "linkedin";
        public static final String ORGANISATION = "organisation";
        public static final String POSITION = "position";
        public static final String COUNTRY = "country";
        public static final String SESSIONS = "sessions";

        public static final String[] FULL_PROJECTION = {
                ID,
                NAME,
                PHOTO,
                BIO,
                EMAIL,
                WEB,
                FACEBOOK,
                TWITTER,
                GITHUB,
                LINKEDIN,
                ORGANISATION,
                POSITION,
                COUNTRY,
                SESSIONS
        };

        public static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME
                        + " ("
                        + _ID + " INTEGER PRIMARY KEY,"
                        + ID + INT_TYPE + COMMA_SEP
                        + NAME + TEXT_TYPE + COMMA_SEP
                        + PHOTO + TEXT_TYPE + COMMA_SEP
                        + BIO + TEXT_TYPE + COMMA_SEP
                        + EMAIL + TEXT_TYPE + COMMA_SEP
                        + WEB + TEXT_TYPE + COMMA_SEP
                        + FACEBOOK + TEXT_TYPE + COMMA_SEP
                        + TWITTER + TEXT_TYPE + COMMA_SEP
                        + GITHUB + TEXT_TYPE + COMMA_SEP
                        + LINKEDIN + TEXT_TYPE + COMMA_SEP
                        + ORGANISATION + TEXT_TYPE + COMMA_SEP
                        + POSITION + TEXT_TYPE + COMMA_SEP
                        + COUNTRY + TEXT_TYPE + COMMA_SEP
                        + SESSIONS + TEXT_TYPE + COMMA_SEP
                        + " )";
        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    }

    public static abstract class Sessions implements BaseColumns {
        public static final String TABLE_NAME = "sessions";

        public static final String ID = "id";
        public static final String TITLE = "title";
        public static final String SUBTITLE = "subtitle";
        public static final String SUMMARY = "summary";
        public static final String DESCRIPTION = "description";
        public static final String START_TIME = "start_time";
        public static final String END_TIME = "end_time";
        public static final String TYPE = "type";
        public static final String TRACK = "track";
        public static final String SPEAKERS = "speakers";
        public static final String LEVEL = "level";
        public static final String MICROLOCATION = "microlocation";

        public static final String[] FULL_PROJECTION = {
                ID,
                TITLE,
                SUBTITLE,
                SUMMARY,
                DESCRIPTION,
                START_TIME,
                END_TIME,
                TYPE,
                TRACK,
                SPEAKERS,
                LEVEL,
                MICROLOCATION
        };

        public static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME
                        + " ("
                        + _ID + " INTEGER PRIMARY KEY,"
                        + ID + INT_TYPE + COMMA_SEP
                        + TITLE + TEXT_TYPE + COMMA_SEP
                        + SUBTITLE + TEXT_TYPE + COMMA_SEP
                        + SUMMARY + TEXT_TYPE + COMMA_SEP
                        + DESCRIPTION + TEXT_TYPE + COMMA_SEP
                        + START_TIME + TEXT_TYPE + COMMA_SEP
                        + END_TIME + TEXT_TYPE + COMMA_SEP
                        + TYPE + TEXT_TYPE + COMMA_SEP
                        + TRACK + INT_TYPE + COMMA_SEP
                        + SPEAKERS + TEXT_TYPE + COMMA_SEP
                        + LEVEL + TEXT_TYPE + COMMA_SEP
                        + MICROLOCATION + INT_TYPE + COMMA_SEP
                        + " )";
        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    }

    public static abstract class Tracks implements BaseColumns {
        public static final String TABLE_NAME = "tracks";

        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String DESCRIPTION = "description";

        public static final String[] FULL_PROJECTION = {
                ID,
                NAME,
                DESCRIPTION
        };

        public static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME
                        + " ("
                        + _ID + " INTEGER PRIMARY KEY,"
                        + ID + " INTEGER,"
                        + NAME + " TEXT,"
                        + DESCRIPTION + " TEXT,"
                        + " )";
        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    }

    public static abstract class Sponsors implements BaseColumns {
        public static final String TABLE_NAME = "sponsors";

        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String URL = "url";
        public static final String LOGO_URL = "logo_url";
        public static final String[] FULL_PROJECTION = {
                ID,
                NAME,
                URL,
                LOGO_URL
        };

        public static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME
                        + " ("
                        + _ID + " INTEGER PRIMARY KEY,"
                        + ID + INT_TYPE + COMMA_SEP
                        + NAME + TEXT_TYPE + COMMA_SEP
                        + URL + TEXT_TYPE + COMMA_SEP
                        + LOGO_URL + TEXT_TYPE + COMMA_SEP
                        + " )";
        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;


    }

    public static abstract class Microlocation implements BaseColumns {
        public static final String TABLE_NAME = "microlocation";

        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String LATITUDE = "latitude";
        public static final String LONGITUDE = "longitude";
        public static final String FLOOR = "floor";
        public static final String[] FULL_PROJECTION = {
                ID,
                NAME,
                LATITUDE,
                LONGITUDE,
                FLOOR

        };

        public static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME
                        + " ("
                        + _ID + " INTEGER PRIMARY KEY,"
                        + ID + INT_TYPE + COMMA_SEP
                        + NAME + TEXT_TYPE + COMMA_SEP
                        + LATITUDE + REAL_TYPE + COMMA_SEP
                        + LONGITUDE + REAL_TYPE + COMMA_SEP
                        + FLOOR + INT_TYPE + COMMA_SEP
                        + " )";
        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;


    }
}
