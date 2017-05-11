package com.codephillip.app.busticket.provider.orders;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import com.codephillip.app.busticket.provider.base.AbstractSelection;

/**
 * Selection for the {@code orders} table.
 */
public class OrdersSelection extends AbstractSelection<OrdersSelection> {
    @Override
    protected Uri baseUri() {
        return OrdersColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code OrdersCursor} object, which is positioned before the first entry, or null.
     */
    public OrdersCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new OrdersCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public OrdersCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code OrdersCursor} object, which is positioned before the first entry, or null.
     */
    public OrdersCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new OrdersCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public OrdersCursor query(Context context) {
        return query(context, null);
    }


    public OrdersSelection id(long... value) {
        addEquals("orders." + OrdersColumns._ID, toObjectArray(value));
        return this;
    }

    public OrdersSelection idNot(long... value) {
        addNotEquals("orders." + OrdersColumns._ID, toObjectArray(value));
        return this;
    }

    public OrdersSelection orderById(boolean desc) {
        orderBy("orders." + OrdersColumns._ID, desc);
        return this;
    }

    public OrdersSelection orderById() {
        return orderById(false);
    }

    public OrdersSelection code(String... value) {
        addEquals(OrdersColumns.CODE, value);
        return this;
    }

    public OrdersSelection codeNot(String... value) {
        addNotEquals(OrdersColumns.CODE, value);
        return this;
    }

    public OrdersSelection codeLike(String... value) {
        addLike(OrdersColumns.CODE, value);
        return this;
    }

    public OrdersSelection codeContains(String... value) {
        addContains(OrdersColumns.CODE, value);
        return this;
    }

    public OrdersSelection codeStartsWith(String... value) {
        addStartsWith(OrdersColumns.CODE, value);
        return this;
    }

    public OrdersSelection codeEndsWith(String... value) {
        addEndsWith(OrdersColumns.CODE, value);
        return this;
    }

    public OrdersSelection orderByCode(boolean desc) {
        orderBy(OrdersColumns.CODE, desc);
        return this;
    }

    public OrdersSelection orderByCode() {
        orderBy(OrdersColumns.CODE, false);
        return this;
    }

    public OrdersSelection dalid(Boolean value) {
        addEquals(OrdersColumns.DALID, toObjectArray(value));
        return this;
    }

    public OrdersSelection orderByDalid(boolean desc) {
        orderBy(OrdersColumns.DALID, desc);
        return this;
    }

    public OrdersSelection orderByDalid() {
        orderBy(OrdersColumns.DALID, false);
        return this;
    }

    public OrdersSelection date(String... value) {
        addEquals(OrdersColumns.DATE, value);
        return this;
    }

    public OrdersSelection dateNot(String... value) {
        addNotEquals(OrdersColumns.DATE, value);
        return this;
    }

    public OrdersSelection dateLike(String... value) {
        addLike(OrdersColumns.DATE, value);
        return this;
    }

    public OrdersSelection dateContains(String... value) {
        addContains(OrdersColumns.DATE, value);
        return this;
    }

    public OrdersSelection dateStartsWith(String... value) {
        addStartsWith(OrdersColumns.DATE, value);
        return this;
    }

    public OrdersSelection dateEndsWith(String... value) {
        addEndsWith(OrdersColumns.DATE, value);
        return this;
    }

    public OrdersSelection orderByDate(boolean desc) {
        orderBy(OrdersColumns.DATE, desc);
        return this;
    }

    public OrdersSelection orderByDate() {
        orderBy(OrdersColumns.DATE, false);
        return this;
    }

    public OrdersSelection customer(String... value) {
        addEquals(OrdersColumns.CUSTOMER, value);
        return this;
    }

    public OrdersSelection customerNot(String... value) {
        addNotEquals(OrdersColumns.CUSTOMER, value);
        return this;
    }

    public OrdersSelection customerLike(String... value) {
        addLike(OrdersColumns.CUSTOMER, value);
        return this;
    }

    public OrdersSelection customerContains(String... value) {
        addContains(OrdersColumns.CUSTOMER, value);
        return this;
    }

    public OrdersSelection customerStartsWith(String... value) {
        addStartsWith(OrdersColumns.CUSTOMER, value);
        return this;
    }

    public OrdersSelection customerEndsWith(String... value) {
        addEndsWith(OrdersColumns.CUSTOMER, value);
        return this;
    }

    public OrdersSelection orderByCustomer(boolean desc) {
        orderBy(OrdersColumns.CUSTOMER, desc);
        return this;
    }

    public OrdersSelection orderByCustomer() {
        orderBy(OrdersColumns.CUSTOMER, false);
        return this;
    }

    public OrdersSelection route(String... value) {
        addEquals(OrdersColumns.ROUTE, value);
        return this;
    }

    public OrdersSelection routeNot(String... value) {
        addNotEquals(OrdersColumns.ROUTE, value);
        return this;
    }

    public OrdersSelection routeLike(String... value) {
        addLike(OrdersColumns.ROUTE, value);
        return this;
    }

    public OrdersSelection routeContains(String... value) {
        addContains(OrdersColumns.ROUTE, value);
        return this;
    }

    public OrdersSelection routeStartsWith(String... value) {
        addStartsWith(OrdersColumns.ROUTE, value);
        return this;
    }

    public OrdersSelection routeEndsWith(String... value) {
        addEndsWith(OrdersColumns.ROUTE, value);
        return this;
    }

    public OrdersSelection orderByRoute(boolean desc) {
        orderBy(OrdersColumns.ROUTE, desc);
        return this;
    }

    public OrdersSelection orderByRoute() {
        orderBy(OrdersColumns.ROUTE, false);
        return this;
    }
}